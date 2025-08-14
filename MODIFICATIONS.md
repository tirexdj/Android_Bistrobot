# Modifications

This file lists all the modifications made to the original Android Kotlin BistroBot.

## 1. Networking Layer

-   **Added Retrofit and OkHttp:** Added dependencies for Retrofit, OkHttp, and Gson to handle network requests.
-   **Created `network` package:** Created a new package to hold all the networking-related classes.
-   **Created `ApiService` interface:** Created an interface to define the API endpoints.
-   **Created `RetrofitClient` object:** Created a singleton object to configure and provide a Retrofit instance.

## 2. Dependency Injection

-   **Added Hilt:** Added the Hilt dependency for dependency injection.
-   **Configured `Application` class:** Created a custom `Application` class (`BistroBotApp`) and annotated it with `@HiltAndroidApp` to initialize Hilt.
-   **Created `di` package:** Created a new package to hold all the Hilt modules.
-   **Created `NetworkModule`:** Created a Hilt module to provide networking-related dependencies.

## 3. Screen Size Adaptability

-   **Created `layout-sw600dp` directory:** Created a new layout directory for tablets.
-   **Created `values-sw600dp` directory:** Created a new values directory for tablets.
-   **Modified layouts and dimensions:** Modified the layouts and dimensions to provide a better user experience on tablets.

## 4. Kiosk Mode

-   **Created `KioskManager` class:** Created a class to handle entering and exiting kiosk mode.
-   **Created `MyDeviceAdminReceiver` class:** Created a `DeviceAdminReceiver` to handle device admin actions.
-   **Registered receiver:** Registered the `MyDeviceAdminReceiver` in the `AndroidManifest.xml` file.
-   **Added device admin policies:** Added a device admin policy file (`device_admin_receiver.xml`) to define the policies required for kiosk mode.
