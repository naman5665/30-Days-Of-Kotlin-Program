import java.util.*

fun main(args: Array<String>) {

    println("Enter The Name Of 1st Player")
    val player1 = readLine()!!
    val weapon1 = Scanner(System.`in`)
    println("Select Weapon For 1st Player")
    println("1.Axe (Damage : 10)")
    println("2.Sword (Damage : 7)")
    println("3.Knife (Damage : 5)")
    val  w1 : Int = weapon1.nextInt()


    println("Enter The Name Of 2nd Player")
    val player2 = readLine()!!
    val weapon2 = Scanner(System.`in`)
    println("Select Weapon for 2nd Player Except For 1st Player")
    println("1.Axe (Damage : 10)")
    println("2.Sword (Damage : 7)")
    println("3.Knife (Damage : 5)")
    val w2 : Int = weapon2.nextInt()



    val Player1 = Player("$player1",1,1)
    if(w1 == 1){
        val Weapon1 = Weapon("Axe",10)
    }else if(w1 == 2){
        val Weapon1 = Weapon("Sword",7)
    }else{
        val Weapon1 = Weapon("Knife",5)
    }


    val Player2 = Player("$player2",1,1)
    if(w2 == 1){
        val Weapon2 = Weapon("Axe",10)
    }else if(w2 == 2){
        val Weapon2 = Weapon("Sword",7)
    }else{
        val Weapon2 = Weapon("Knife",5)
    }


    println("Players Have Been Entered In The Battleground With Their Weapons")


    if(w1 == 1 && w2 == 2){
        Player2.lives = 0
    }else if(w1 == 1 && w2 == 3){
        Player2.lives = 0
    }else if(w1 == 2 && w2 == 1){
        Player1.lives = 0
    }else if(w1 == 2 && w2 == 3){
        Player2.lives = 0
    }else if(w1 == 3 && w2 == 1){
        Player1.lives = 0
    }else{
        Player1.lives = 0
    }

    println("--------------------------------------------------------")

    Player1.show()
    Player2.show()

    println("---------------------------------------------------------")


   println("===========================================================================")


    println("Some Players Tries To Loot")



    val naman = Player("Naman")
    val rakshit = Player("Rakshit")

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    naman.inventory.add(redPotion)
    naman.showInventory()
    println(naman.toString())

    val greenPotion = Loot("Green Potion",LootType.ARMOR,10.00)
    rakshit.inventory.add(greenPotion)
    rakshit.showInventory()
    println(rakshit.toString())

}