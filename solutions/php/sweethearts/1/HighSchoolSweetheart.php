<?php

class HighSchoolSweetheart
{
    public function firstLetter(string $name): string
    {
        $trimmed= trim($name);
        return $firstLetter = $trimmed[0];
    }

    public function initial(string $name): string
    {
        $first = $this->firstLetter($name);
        $newString = ucfirst($first) . ".";
        return $newString;
    }

    public function initials(string $name): string
    {
        $names = explode(" ",$name);
        $firstName = $names[0];
        $lastName = $names[1];
        $first_initial = $this->initial($firstName);
        $second_initial = $this->initial($lastName);
        return $first_initial . " " . $second_initial;
    }

    public function pair(string $sweetheart_a, string $sweetheart_b): string
    {
        $first_person = $this -> initials($sweetheart_a);
        $second_person = $this -> initials($sweetheart_b);
        return <<<HEART
     ******       ******
   **      **   **      **
 **         ** **         **
**            *            **
**                         **
**     {$first_person}  +  {$second_person}     **
 **                       **
   **                   **
     **               **
       **           **
         **       **
           **   **
             ***
              *
HEART;
    }
}
