execute as @e[tag=stars] at @s run particle dust 0 0.096 0.368 1 ~ ~ ~ .2 .2 .2 0.25 50

execute as @e[tag=stars] at @s unless block ~ ~-0.01 ~ #notenoughorigins:non_solid run function notenoughorigins:hit_block
execute as @e[tag=stars] at @s unless block ~-0.01 ~ ~ #notenoughorigins:non_solid run function notenoughorigins:hit_block
execute as @e[tag=stars] at @s unless block ~ ~ ~-0.01 #notenoughorigins:non_solid run function notenoughorigins:hit_block
execute as @e[tag=stars] at @s unless block ~ ~0.01 ~ #notenoughorigins:non_solid run function notenoughorigins:hit_block
execute as @e[tag=stars] at @s unless block ~0.01 ~ ~ #notenoughorigins:non_solid run function notenoughorigins:hit_block
execute as @e[tag=stars] at @s unless block ~ ~ ~0.01 #notenoughorigins:non_solid run function notenoughorigins:hit_block