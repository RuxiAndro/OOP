public class Ghiozdan2 {
    public Rechizita2[] lista=new Rechizita2[100];
    private int k;

    Ghiozdan2()
    {
        k=0;
    }

    public void addCaiet(String nume)
    {
        lista[k]=new Caiet2(nume);
        k++;
    }

    public void addManual(String nume)
    {
        lista[k]=new Manual2(nume);
        k++;
    }

    public void listItems()
    {
        for(int i=0;i<k;i++)
            lista[i].getNume();
    }

    public void listManual()
    {
        for(int i=0;i<k;i++)
            if(lista[i] instanceof Manual2)
                lista[i].getNume();
    }

    public void listCaiet()
    {
        for(int i=0;i<k;i++)
            if(lista[i] instanceof Caiet2)
                lista[i].getNume();
    }

    public int getNrRechizite()
    {
        return k;
    }

    public int getNrManuale()
    {
        int cnt=0;
        for(int i=0;i<k;i++)
            if(lista[i] instanceof Manual2)
                cnt++;
        return cnt;
    }

    public int getNrCaiete()
    {
        int cnt=0;
        for(int i=0;i<k;i++)
            if(lista[i] instanceof Caiet2)
                cnt++;
        return cnt;
    }
}
