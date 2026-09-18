//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
int szukajIndexNajWieksza(int[] nieposortowana)
{
    int sprawdzana = 0;
    int indexNajwiekszej = 0;
    for (int i=0;i<nieposortowana.length;i++)
    {
            if(nieposortowana[i]>sprawdzana)
            {
                indexNajwiekszej=i;
                sprawdzana =  nieposortowana[i];
            }
    }
    return indexNajwiekszej;

}
void sortuj(int[] nieposortowana)
{

}
int[] wczytajTablice()
{
    Scanner scanner = new Scanner(System.in);
    int[] nieposortowana = new int[10];
    for (int i = 0; i <= nieposortowana.length-1; i++) {
        IO.println("podaj " + (i+1)+" liczbe tablicy");
        nieposortowana[i] = scanner.nextInt();
    }


    return nieposortowana;
}
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Wstępny commit"));
    IO.println("największa liczba ma index:"+(szukajIndexNajWieksza(wczytajTablice())+1));




}
