import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;
public class WriteInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          
		  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String catName;
		
		
		 while(!(catName= reader.readLine()).isEmpty()){
	          
	            Cat cat = CatFactory.getCatByKey(catName);
	            System.out.println(cat.toString());
	        }
		
		
	}

	  static class CatFactory {
	        static Cat getCatByKey(String key) {
	            Cat cat = null;
	            if ("feral".equalsIgnoreCase(key)) {
	                cat = new MeanCat("Claws");
	            } else if ("miss".equalsIgnoreCase(key)) {
	                cat = new NiceCat("Missy");
	            } else if ("smudge".equalsIgnoreCase(key)) {
	                cat = new NiceCat("Smudgey");
	            } else {
	                cat = new Cat(key);
	            }
	            return cat;
	        }
	    }

	    static class Cat {
	        private String name;

	        protected Cat(String name) {
	            this.name = name;
	        }

	        public String getName() {
	            return this.name;
	        }

	        public String toString() {
	            return "I'm " + getName() + ", an alley cat";
	        }
	    }

	    static class MeanCat extends Cat {
	        MeanCat(String name) {
	            super(name);
	        }

	        public String toString() {
	            return "I'm " + getName() + ", and I'm going to claw your eyes out";
	        }
	    }

	    static class NiceCat extends Cat {
	        NiceCat(String name) {
	            super(name);
	        }

	        public String toString() {
	            return "I'm a nice kitten named " + getName();
	        }
	    }
	
}
