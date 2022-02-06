// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import java.awt.event.InputEvent

// Autoclicker and Auto run, need two buttons to toggle on/off listening for two fields where I can bind keypresses/combos
@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        //Auto-Clicker
        Button(onClick = {
            text = "I AM SPEED!"
        }) {
            public static void click(int x int y) throws AWTException{
                Robot bot = new Robot();
                bot.mousePress(InputEvent.BUTTON1_MASK)
        }
        //Auto-run
        Button(onClick = {
            text = "I am Lazy."
        }) {
            Robot bot = new Robot();
            bot.keyPress(KeyEvent.)
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
