<?php

class Lasagna
{
    public function expectedCookTime()
    {
        return 40;
    }

    public function remainingCookTime($elapsed_minutes)
    {
        $time = $this->expectedCookTime();
        return $time - $elapsed_minutes;
    }

    public function totalPreparationTime($layers_to_prep)
    {
        return $layers_to_prep * 2;
    }

    public function totalElapsedTime($layers_to_prep, $elapsed_minutes)
    {
        $prep = $this->totalPreparationTime($layers_to_prep);
        return $prep + $elapsed_minutes;
    }

    public function alarm()
    {
        return "Ding!";
    }
}
