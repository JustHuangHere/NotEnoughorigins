playsound minecraft:entity.illusioner.prepare_blindness master @a[distance=..15] ~ ~ ~ 1 0
summon armor_stand ~ ~7 ~ {ShowArms:0b,Small:1b,Invisible:1b,NoBasePlate:1b,Tags:["stars"]}
execute as @e[tag=stars] at @s rotated as @a[tag=starSelf] run tp @s ~ ~ ~ ~ ~