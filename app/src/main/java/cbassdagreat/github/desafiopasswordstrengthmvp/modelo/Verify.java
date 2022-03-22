package cbassdagreat.github.desafiopasswordstrengthmvp.modelo;

public class Verify {

    public int evaluate(String password)
    {
        int total = 0;

        if(hasNum(password))
        {
            total++;
        }
        if(hasCaps(password))
        {
            total++;
        }
        if(hasLength(password))
        {
            total++;
        }

        return total;
    }

    private boolean hasCaps(String pass)
    {
        for(char letra : pass.toCharArray())
        {
            if (Character.isUpperCase(letra))
            {
                return true;
            }

            }
            return false;
    }

    public boolean hasNum(String pass)
    {
        for(char letra : pass.toCharArray())
        {
            if (Character.isDigit(letra))
            {
                return true;
            }

        }
        return false;
    }

    public boolean hasLength(String pass)
    {
        if(pass.length()>=5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
