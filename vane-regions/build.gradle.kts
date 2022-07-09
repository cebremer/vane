plugins {
	id("com.github.johnrengelman.shadow") version "7.1.0"
}

dependencies {
	implementation(project(":vane-portals"))
	compileOnly(group = "com.github.MilkBowl", name = "VaultAPI", version = "1.7")
	compileOnly(group = "org.json", name = "json", version = "20200518")
}

tasks {
	shadowJar {
		configurations = listOf()
		relocate("org.json", "org.oddlama.vane.external.json")
	}
}
