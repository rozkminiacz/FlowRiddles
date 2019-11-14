find src/test/kotlin/tech/michalik/flowriddles -type f -name "Riddle[0-9]*Test.kt" -exec sed -i "s/Riddle\([0-9]*\)\.solve/tech.michalik.flowriddles.solutions.Riddle\1Solution\.solve/" {} \;
