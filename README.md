# iPhone Experience (Android launcher)

A dark, iOS 18-inspired Android home launcher written in Kotlin with native Android views.
It is a launcher/theme experience, not an iOS operating-system replacement.

## Included
- Android HOME launcher entry point; choose it as the default Home app.
- Installed-app discovery and launching.
- Two swipeable app pages.
- App search.
- Dock with best-effort Phone, Messages, Chrome and Camera matching.
- iOS-inspired Control Center overlay.
- Shortcuts to Android Wi-Fi, Bluetooth, Airplane mode, Do Not Disturb, sound and wallpaper settings.
- Launcher-window brightness slider (does not change global system brightness).
- Dark visual styling and Dynamic Island-inspired decorative element.

## Build an APK

### Requirements
- Android Studio (current stable)
- Android SDK Platform 35
- JDK 17

### Steps
1. Unzip the project.
2. Open the `iPhoneExperience` folder in Android Studio.
3. Allow Gradle sync to finish. Gradle will download the Android Gradle Plugin and Kotlin plugin.
4. Connect an Android phone with USB debugging enabled, or create an emulator.
5. Select **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
6. The debug APK will be at:
   `app/build/outputs/apk/debug/app-debug.apk`
7. Install it on your phone. If Android blocks installation, allow your file manager/browser to install unknown apps.
8. Press Home and select **iPhone Experience**. Choose **Always** if you want it as the default launcher.

Command-line build (from the project folder):
```bash
gradle assembleDebug
```
If you have no Gradle installation, use Android Studio's bundled Gradle sync/build workflow or generate a Gradle wrapper from Android Studio.

## Important Android limitations
- Android controls the real lock screen, notification shade, status bar, system navigation, calls, camera, Bluetooth and permissions. A normal launcher cannot replace those system components.
- Wi-Fi/Bluetooth/Airplane Mode tiles open Android settings; they do not silently toggle protected system state.
- The brightness slider changes only this app window's brightness, not the device-wide setting.
- This starter project does not implement a real lock-screen replacement, notification listener, widgets host, icon pack engine, or Dynamic Island notifications.
- `QUERY_ALL_PACKAGES` is used to show the installed app list. This permission may be restricted by Google Play policy; this project is intended for personal sideloading/testing.
- App icons are the actual Android app icons; this is a functional launcher rather than an exact copy of Apple's proprietary UI/assets.

## Customization
- Main UI and behavior: `app/src/main/java/com/iphoneexperience/launcher/MainActivity.kt`
- App identity and Android launcher declaration: `app/src/main/AndroidManifest.xml`
- Theme: `app/src/main/res/values/styles.xml`
