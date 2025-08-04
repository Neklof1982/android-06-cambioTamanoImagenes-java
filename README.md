# 🚀 Practica 06 - Cambio de Tamaño de Imágenes

## 📝 Descripción

Este proyecto es una práctica para aprender a interactuar con **ImageViews** en una aplicación Android utilizando **MotionEvent** para detectar las interacciones táctiles del usuario. El objetivo es cambiar el tamaño de dos imágenes cuando se tocan y mueven sobre ellas, ofreciendo una experiencia visual dinámica.

La app tiene dos imágenes en la interfaz de usuario. Cuando se presionan, una se agranda mientras la otra se reduce. Además, al mover el dedo sobre ellas, se actualiza el tamaño en tiempo real, lo que permite al usuario interactuar de manera fluida con las imágenes.

## ⚙️ Tecnologías usadas

- Android SDK 34  
- Java (MainActivity)  
- ConstraintLayout
- MotionEvent
- Gradle Kotlin DSL (`build.gradle.kts`)

## 📐 Diseño UI

El layout principal (`activity_main.xml`) utiliza **ConstraintLayout** para posicionar las imágenes:

- Dos **ImageView** que se muestran de manera central.
- Al tocar sobre una de las imágenes, esta cambia de tamaño mientras la otra se reduce.
- Las imágenes se pueden mover o redimensionar en función de la interacción del usuario.
  
Además, se ha utilizado el sistema de **Guideline** para facilitar la alineación de los elementos.

## 🚀 Ejecución

1. Abrir el proyecto en **Android Studio** con el SDK 34 configurado.
2. Ejecutar en un **dispositivo/emulador con Android 11 (API 30)** o superior.
3. Tocar las imágenes para ver cómo cambian de tamaño al interactuar con ellas.

## 📌 Versionado

Este proyecto utiliza **Git** y **GitHub** para el control de versiones, permitiendo llevar un registro detallado de los cambios durante el desarrollo.

## 📄 Licencia

Este proyecto está bajo la [MIT License](./LICENSE).

## 🎁 Expresiones de Gratitud  

Podéis invitarme a una cerveza 🍺 o un café ☕.  
Gracias por la lectura 🤓.  
