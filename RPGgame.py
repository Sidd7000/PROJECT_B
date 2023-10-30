import random

class Character:
    def __init__(self, name, health, power):
        self.name = name
        self.health = health
        self.power = power

    def attack(self, enemy):
        enemy.health -= self.power
        print(f"{self.name} attacks {enemy.name}!")

    def is_alive(self):
        return self.health > 0

class Hero(Character):
    def __init__(self, name, health, power, coins):
        super().__init__(name, health, power)
        self.coins = coins

    def show_status(self):
        print(f"Health: {self.health}, Power: {self.power}, Coins: {self.coins}")

class Goblin(Character):
    pass

def battle(hero, enemy):
    while hero.is_alive() and enemy.is_alive():
        hero.show_status()
        enemy.attack(hero)
        if hero.is_alive():
            hero.attack(enemy)
            if not enemy.is_alive():
                print(f"{enemy.name} is defeated!")
                hero.coins += 5
                break
        else:
            print(f"{hero.name} has been defeated.")
            break

hero = Hero("Hero", 10, 5, 10)
goblin = Goblin("Goblin", 6, 2)

battle(hero, goblin)
