# Tecnologías usadas
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=androidstudio&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![Material Design 3](https://img.shields.io/badge/Material%20Design%203-757575?style=for-the-badge&logo=materialdesign&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

# Control de versiones
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

---

# 🧊 Mi Galería — Android App

Una aplicación interactiva para Android enfocada en el manejo de estado (`State Management`) y navegación secuencial de elementos. Desarrollada con **Kotlin** y **Jetpack Compose**, cuenta con una interfaz temática inspirada en tonos glaciares, degradados dinámicos y navegación circular de imágenes y detalles de productos.

---

## 🚀 Características

* 🖼️ **Visor Interactivo:** Galería de imágenes dinámicas que actualiza el título, la descripción y el precio del elemento en tiempo real.
* 🔄 **Navegación Circular:** Ciclo infinito mediante los botones *Anterior* y *Siguiente* (al llegar al final vuelve al inicio y viceversa).
* 🎨 **Estilo Glaciar Personalizado:** Fondo con degradado vertical mediante `Brush.verticalGradient` y paleta de colores personalizada mediante recursos de `R.color`.
* ⚡ **Manejo de Estado Reactivo:** Uso de `remember` y `mutableStateOf` para mantener el índice de navegación en memoria sin perder reactividad.
* 📱 **UI Responsiva:** Renderizado dinámico adaptado mediante `Modifier`, `ContentScale.Crop` y componentes nativos de Material Design 3.

---

## 🛠️ Tecnologías y Herramientas

* **Lenguaje:** Kotlin
* **UI Framework:** Jetpack Compose
* **Gestión de Estado:** `remember`, `mutableStateOf`, `getValue`, `setValue`
* **Estilos y Recursos:** Material 3, `colorResource`, `painterResource`, `Brush.verticalGradient`
* **Mínimo SDK:** Android 7.0 (API 24+)

---

## 📂 Estructura del Proyecto

```text
MiGaleria/

 app/                     # Módulo principal de la aplicación
    ├── build.gradle.kts     # Configuración y dependencias del módulo app
    └── src/
        ├── main/
        │   ├── AndroidManifest.xml          # Permisos y configuración principal
        │   ├── java/
        │   │   └── com/example/migaleria/
        │   │       └── MainActivity.kt      # Lógica de la galería, interfaz y estado
        │   │
        │   └── res/                         # Recursos estáticos de la aplicación
        │       ├── drawable/                # Imágenes de la galería (hielo.jpg, hielo2.jpg, etc.)
        │       ├── values/
        │       │   ├── colors.xml           # Paleta de colores glaciales (BlancoGlaciar, AzulProfundo, etc.)
        │       │   └── strings.xml          # Textos y recursos de cadena estáticos
        │       └── mipmap/                  # Iconos del launcher
        │
        ├── androidTest/                     # Pruebas de interfaz
        └── test/                            # Pruebas unitarias
```

---

## ⚙️ Configuración y Requisitos del Entorno

### Prerrequisitos
* **Android Studio:** Versión *Jellyfish*, *Koala* o superior recomendada.
* **JDK:** Versión 17 (incluida en Android Studio).
* **SDK de Android:** 
  * **Compile SDK:** 34 (o superior)
  * **Minimum SDK:** API 24 (Android 7.0 Nougat)

### Pasos para clonar y ejecutar:

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/Mcpapu9/MiGaleria.git
   ```

2. **Abrir el proyecto:**
   * Abre Android Studio, selecciona **Open** y navega hasta la carpeta del proyecto clonado.

3. **Sincronización de Gradle:**
   * Espera a que Android Studio descargue las dependencias y sincronice los archivos del proyecto.

4. **Ejecutar en Emulador o Dispositivo:**
   * Selecciona un dispositivo virtual o físico con Depuración USB activada y presiona **Run ▶** (`Shift + F10`).
