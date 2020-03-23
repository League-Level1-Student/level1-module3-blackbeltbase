package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
	Backpack myBackpack = new Backpack();
	myBackpack.packAndCheck();
	Pencil pencil = new Pencil();
	   myBackpack.putInBackpack(pencil);
       Ruler ruler = new Ruler();
       myBackpack.putInBackpack(ruler);
          Textbook textbook = new Textbook();
          myBackpack.putInBackpack(textbook);
          myBackpack.packAndCheck();
	}
}
