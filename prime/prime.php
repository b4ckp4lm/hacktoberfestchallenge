<?php
// A file to print prime numbers 
function ($limit)
{
    for ($i=1; $i<=$limit, $i++)
    {
        if ($limit % i == 0)
        {
            $c = c+1;
        }
    }
    if ($c > 2)
    {
        echo "Not a prime number";
    }
    else
    {
        echo "It is a prime number";
    }
}