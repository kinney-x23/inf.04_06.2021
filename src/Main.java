//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
int szukajIndexNajWieksza(int[] tablica,int koniec)
{
    int indexNajwiekszej = 0;

    for (int i = 1; i < koniec; i++)
    {
        if (tablica[i] > tablica[indexNajwiekszej])
        {
            indexNajwiekszej = i;
        }
    }

    return indexNajwiekszej;

}
void sortuj(int[] tablica)
{
    int przechowaj = 0;

    for(int i = tablica.length; i > 1; i--)
    {
        int indexNajwiekszej = szukajIndexNajWieksza(tablica, i);

        przechowaj = tablica[indexNajwiekszej];
        tablica[indexNajwiekszej] = tablica[i - 1];
        tablica[i - 1] = przechowaj;
    }


}

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Wstępny commit"));

    Scanner scanner = new Scanner(System.in);
    int[] tablica = new int[5];
    for (int i = 0; i <= tablica.length-1; i++) {
        IO.println("podaj " + (i+1)+" liczbe tablicy");
        tablica[i] = scanner.nextInt();
    }

    //IO.println("największa liczba ma index:"+(szukajIndexNajWieksza(tablica)+1));
    sortuj(tablica);

    for (int i = 0; i < tablica.length; i++)
    {
        IO.println(tablica[i]);
    }


}
