<?php

class LuckyNumbers
{
    public function sumUp(array $digitsOfNumber1, array $digitsOfNumber2): int
    {
        foreach($digitsOfNumber1 as $num1){
            $int = (int) $num1;
            $newInt = $newInt . $int;
        }
        foreach($digitsOfNumber2 as $num2){
            $int2 = (int) $num2;
            $newInt2 = $newInt2 . $int2;
        }
        return (int) $newInt + $newInt2;
    }

    public function isPalindrome(int $number): bool
    {
        $reverse_number = (string) $number;
        $reverse_number = strrev($reverse_number);
        if($reverse_number == $number){
            return true;
        }else{
            return false;
        }
        
    }

    public function validate(string $input): string
    {
        if ($input == '' ){
            return "Required field";
        }
        if ((int) $input<=0 ){
            echo("input menor que 0");
            return "Must be a whole number larger than 0";
        }
        if (!is_int((int) $input) ){
            echo("input no es int");
            return "Must be a whole number larger than 0";
        }
        
        return '';
    }
}
