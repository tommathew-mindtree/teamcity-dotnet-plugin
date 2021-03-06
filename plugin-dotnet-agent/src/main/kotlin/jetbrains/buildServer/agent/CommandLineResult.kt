package jetbrains.buildServer.agent

data class CommandLineResult(
        private val _exitCode: Sequence<Int>,
        val standardOutput: Sequence<String>,
        val errorOutput: Sequence<String>) {

    val exitCode: Int
        get() = _exitCode.single()
}