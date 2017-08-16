package materialien;

public class Kontakt
{
    private String _name;
    
    public Kontakt(String name)
    {
        _name = name;
    }
    
    public String getName()
    {
        return _name;
    }
    
    public void setName(String name)
    {
        _name = name;
    }
    
    @Override
    public boolean equals(Object that)
    {
        if (that instanceof Kontakt)
        {
            return equals((Kontakt)that);
        }
        else return false;
    }
    
    public boolean equals(Kontakt that)
    {
        return that._name == this._name;
    }
    
    @Override
    public int hashCode()
    {
        return _name.hashCode();
    }
}
