<?php

function language_list(...$language_array)
{
    return $language_array;
}
function add_to_language_list($language_array, $new_language){
    $language_array[] = $new_language;
    return $language_array;
}
function prune_language_list($language_array){
    array_shift($language_array);
    return $language_array;
}
function current_language($language_array){
    $first = array_shift($language_array);
    return $first;
}
function language_list_length ($language_array){
    return count($language_array);
}
