
import java.util.HashSet;
import java.util.Set;


public class HashCodeMain {
    public static void main(String[] args) {
	Set<String> hashSet=new HashSet<String>();
        hashSet.add("Python"); hashSet.add("Java");  hashSet.add("Ruby"); hashSet.add("C++");
        hashSet.add("C++");//Ayný degeri tekrar eklemek istersek de ekleme yapmiyor.
        //Set ler bir elemani sadece bir defa depolar
        for (String s:hashSet){
            System.out.println(s);
        }
        Set<Marka> markaHashSet=new HashSet<Marka>();
       
    }
    
    class Marka{
        @Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

		private int Id;
        private String Adi;

        public Marka(int Id, String Adi) {
            this.Id = Id;
            this.Adi = Adi;
        }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "|--|-> Id :"+Id+" Isým :"+Adi+" <-|--|";
		}
        
    }
}
