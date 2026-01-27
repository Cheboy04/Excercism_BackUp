<?php

class PizzaPi
{
    public function calculateDoughRequirement($pizzas,$people)
    {
        return $grams = $pizzas * (($people * 20)+200);
    }

    public function calculateSauceRequirement($pizzas, $can_volume)
    {
        return $cans = $pizzas * (125 / $can_volume);
    }

    public function calculateCheeseCubeCoverage($cheese_dimension,$desired_thickness, $diameter)
    {
        //floor($var) se podría usar para redondear hacia abajo
        return (int) $cheese_cube_coverage = ($cheese_dimension**3) / ($desired_thickness * 3.14 * $diameter);
    }

    public function calculateLeftOverSlices($pizzas, $num_friends)
    {
        (int) $result = $pizzas / $num_friends;
        if ($pizzas % 2 == 0 && $num_friends % 2 == 0){
            return floor($result);
        }else{
            return ceil($result);
        }
    
    }
}
