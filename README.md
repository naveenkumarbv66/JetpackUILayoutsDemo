# Android Jetpack Layouts

A Jetpack Compose app demonstrating core layout primitives (Column, Row, Box) using MVVM and Navigation Compose. The main screen provides a short description and a button that opens a dedicated demo activity hosting a NavHost.

## Tech stack
- Kotlin + Jetpack Compose (Material3, Compose BOM)
- Navigation Compose for screen transitions
- MVVM with a simple ViewModel
- Version Catalogs (libs.versions.toml)
- Target/Compile SDK 36, Min SDK 24
- Kotlin/JVM 17 toolchain

## Requirements
- Android Studio Koala+ recommended
- JDK 17
- Android SDK 36

## Project structure
- `app/src/main/java/com/naveen/androidjetpacklayouts/MainActivity.kt`
  - Landing screen with description and a button to open the demo
- `app/src/main/java/com/naveen/androidjetpacklayouts/LayoutDemo.kt`
  - Activity hosting a `NavHost` and `LayoutViewModel`
  - Routes: Home, Column, Row, Box
  - Home screen: three buttons to navigate to each layout demo
- `app/src/main/java/com/naveen/androidjetpacklayouts/ui/theme/*`
  - Compose Material3 theme setup (dynamic color supported)

## How it works
- Main screen → Button launches `LayoutDemo` activity
- `LayoutDemo` uses a `NavHost` (Navigation Compose) to navigate between demo composables:
  - Column: Vertical arrangement of two text elements
  - Row: Horizontal arrangement of two text elements
  - Box: Stacks/overlaps children with different alignments
- `LayoutViewModel` provides a description string (MVVM entry point)

## Run
1. Open the project in Android Studio
2. Sync Gradle
3. Select an emulator/device (API 24+)
4. Run the `app` configuration

## Notes
- Compose-first UI (no XML layouts)
- Release build currently has minify disabled; enable R8 and configure rules when needed
- Versions managed via `gradle/libs.versions.toml` (Compose uses BOM)

## Next steps / ideas
- Add back navigation and top app bar
- Expand demos: `LazyColumn`, `ConstraintLayout`, `FlowRow/FlowColumn`
- Introduce UI tests with `createAndroidComposeRule`
- Extract navigation setup into its own file and add route arguments
