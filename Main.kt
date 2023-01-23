/* Escreva um programa para ajudar a empresa XPTO calcular o bonus que os funcionarios receberão
no final do ano. Os bonus sao classificados por cargo
a. gerente recebe 2000
b. coordenador recebe 1500
c. engenheiro de software recebe 1000
d. estagiario recebe 500
 */
fun bonus(cargo: String):Float {
    var bonus = 0f
    if (cargo == "gerente") {
        bonus = 2000f
    } else if (cargo == "coordenador") {
        bonus = 1500f
    } else if (cargo == "engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "estagiario") {
        bonus = 500f
    }
    return bonus
}
fun main() {
    val bonus = bonus(cargo = "gerente")
    println(bonus)
}