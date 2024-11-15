fun main() {
    println("Bienvenido al Taller ")
    println("A continuación, mostramos ejemplos funcionales de los elementos requeridos:")

    // 1. Text
    textExample()

    // 2. Button
    buttonExample()

    // 3. OutlinedButton
    outlinedButtonExample()

    // 4. TextField
    textFieldExample()

    // 5. Image (simulado)
    imageExample()

    // 6. DropdownMenu
    dropdownMenuExample()

    // 7. Checkbox
    checkboxExample()

    // 8. Switch
    switchExample()

    // 9. RadioButton
    radioButtonExample()

    // 10. Slider
    sliderExample()

    // 11. FloatingActionButton
    floatingActionButtonExample()

    // 12. Row
    rowExample()

    // 13. Column
    columnExample()

    // 14. LazyColumn
    lazyColumnExample()

    // 15. Card
    cardExample()

    // 16. Scaffold
    scaffoldExample()

    // 17. Surface
    surfaceExample()
}

// Ejemplo 1: Text
fun textExample() {
    println("\n--- Ejemplo de Text ---")
    println("Este es un ejemplo de texto.")
}

// Ejemplo 2: Button
fun buttonExample() {
    println("\n--- Ejemplo de Button ---")
    println("Simulando un botón en consola:")
    println("Presiona 'Enter' para continuar.")
    readLine()
    println("Botón presionado.")
}

// Ejemplo 3: OutlinedButton
fun outlinedButtonExample() {
    println("\n--- Ejemplo de OutlinedButton ---")
    println("[OutlinedButton] Presiona 'Enter' para continuar.")
    readLine()
    println("OutlinedButton presionado.")
}

// Ejemplo 4: TextField
fun textFieldExample() {
    println("\n--- Ejemplo de TextField ---")
    print("Ingresa tu nombre: ")
    val input = readLine()
    println("Hola, $input.")
}

// Ejemplo 5: Image (Simulado)
fun imageExample() {
    println("\n--- Ejemplo de Image ---")
    println("Simulando una imagen en consola: [Imagen no soportada en consola].")
}

// Ejemplo 6: DropdownMenu
fun dropdownMenuExample() {
    println("\n--- Ejemplo de DropdownMenu ---")
    println("Selecciona una opción:")
    println("1. Opción 1")
    println("2. Opción 2")
    println("3. Opción 3")
    val choice = readLine()?.toIntOrNull()
    println("Seleccionaste: ${choice ?: "ninguna opción válida"}.")
}

// Ejemplo 7: Checkbox
fun checkboxExample() {
    println("\n--- Ejemplo de Checkbox ---")
    println("[ ] Aceptar términos y condiciones. Presiona 'y' para aceptar:")
    val response = readLine()
    if (response == "y") {
        println("[X] Términos aceptados.")
    } else {
        println("[ ] No aceptado.")
    }
}

// Ejemplo 8: Switch
fun switchExample() {
    println("\n--- Ejemplo de Switch ---")
    println("Activar modo nocturno (s/n):")
    val response = readLine()
    println(if (response == "s") "Modo nocturno activado." else "Modo nocturno desactivado.")
}

// Ejemplo 9: RadioButton
fun radioButtonExample() {
    println("\n--- Ejemplo de RadioButton ---")
    println("Selecciona una opción:")
    println("(1) Opción A")
    println("(2) Opción B")
    val choice = readLine()
    println("Seleccionaste: ${if (choice == "1") "Opción A" else "Opción B"}.")
}

// Ejemplo 10: Slider
fun sliderExample() {
    println("\n--- Ejemplo de Slider ---")
    println("Selecciona un nivel entre 1 y 10:")
    val level = readLine()?.toIntOrNull()
    println("Nivel seleccionado: ${level ?: "ninguno"}")
}

// Ejemplo 11: FloatingActionButton
fun floatingActionButtonExample() {
    println("\n--- Ejemplo de FloatingActionButton ---")
    println("[+] Acción rápida simulada.")
}

// Ejemplo 12: Row
fun rowExample() {
    println("\n--- Ejemplo de Row ---")
    println("Elemento 1 | Elemento 2 | Elemento 3")
}

// Ejemplo 13: Column
fun columnExample() {
    println("\n--- Ejemplo de Column ---")
    println("Elemento 1\nElemento 2\nElemento 3")
}

// Ejemplo 14: LazyColumn
fun lazyColumnExample() {
    println("\n--- Ejemplo de LazyColumn ---")
    (1..10).forEach { println("Elemento $it") }
}

// Ejemplo 15: Card
fun cardExample() {
    println("\n--- Ejemplo de Card ---")
    println("###################")
    println("#     Tarjeta     #")
    println("###################")
}

// Ejemplo 16: Scaffold
fun scaffoldExample() {
    println("\n--- Ejemplo de Scaffold ---")
    println("Top Bar: [Ejemplo de Scaffold]")
    println("Contenido principal...")
    println("Footer: [Pie de página]")
}

// Ejemplo 17: Surface
fun surfaceExample() {
    println("\n--- Ejemplo de Surface ---")
    println("==============")
    println("|  Contenido  |")
    println("==============")
}
