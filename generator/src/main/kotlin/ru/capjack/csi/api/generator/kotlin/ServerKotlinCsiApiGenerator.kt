package ru.capjack.csi.api.generator.kotlin

import ru.capjack.tool.biser.generator.CodePath
import ru.capjack.tool.biser.generator.kotlin.KotlinCodersGenerator

class ServerKotlinCsiApiGenerator(sourcePackage: CodePath) : KotlinCsiApiGenerator(sourcePackage) {
	override fun createApiGenerator(sourcePackage: CodePath, codersGenerator: KotlinCodersGenerator): KotlinApiGenerator {
		return ServerKotlinApiGenerator(sourcePackage, codersGenerator)
	}
}