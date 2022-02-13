@file:Suppress("CanBeVal", "CanBeVal", "CanBeVal")

package de.schneckedde.grizzno

import com.soywiz.korge.input.onClick
import com.soywiz.korge.scene.Scene
import com.soywiz.korge.ui.uiButton
import com.soywiz.korge.view.*
import com.soywiz.korim.color.Colors


class MainMenuScene : Scene() {
	override suspend fun Container.sceneInit() {
		var background = SolidRect(views.virtualWidth, views.virtualHeight, Colors["#ffe357c6"])
		addChild(background)
		container {
			var playButton = uiButton(512.0, 64.0) {
				
				colorMul = Colors.GREEN
				
				position(centerOnStage())
				onClick {
					sceneContainer.pushTo<MainGameScene>()
				}
			}
			var exitButton = uiButton(512.0, 64.0) {
				
				colorMul = Colors.RED
				var x = playButton.x
				var y = playButton.y
				y += 100.0
				position(x, y)
				onClick {
					views.gameWindow.close()
				}
			}
			text("Play") {
				textSize = 50.0
				centerOn(playButton)
				
			}
			text("Exit") {
				textSize = 50.0
				centerOn(exitButton)
				
			}
			
		}
		
		
	}
}