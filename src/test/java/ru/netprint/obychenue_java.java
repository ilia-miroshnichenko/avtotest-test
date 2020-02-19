package ru.netprint;

class MyString
{
    public static void main (String args[])
    {
        String s1 = "Строка";
        String s2 = new String();
        String s3 = new String ("Miroshnichenko");
        s1 = "Ilia";
        s2 = " ";
        s3 = s3 + s2; // Сложение строк.
        s3 += s1;
// Аналогично записи s3 = s3 + s1.
        System. out .println ("Мое имя — " + s3);
    }
}

