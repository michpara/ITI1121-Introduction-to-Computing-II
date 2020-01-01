public class Utils {

    // Returns a copy of the array 'in' where each word occurring 
    //in the array 'what' has been replaced by the word occurring in the same position in the array 'with'
    public static String[] findAndReplace( String[] in, String[] what, String[] with ) {

        String[] out = null; // The new array to be returned
		boolean valid = true; // True if the pre-conditions are satistified

      	// Testing pre-conditions
      	if ( in == null || what == null || with == null ) {
        	valid = false; //valid is false if in, what or with are null
      	} 

        else {
            for(int i = 0; valid == true && i<in.length;i++){
                if(in[i] == null){ 
                    valid = false; //valid is false if any element in the array in are null
                }
            }

            if(what.length != with.length && valid){
                valid = false; //valid is false if the length of the array what isn't the same as the array width
            } else{
            	for(int i=0; valid && i<what.length;i++){
                    if(what[i] == null || with[i] == null){
                    	valid = false; //valid is false if any element in the array what or with is null
                	}
              	}
            }
      	}

      	if ( valid ) { //if valid is true
      	    out = new String[in.length]; 
      	    for (int i=0; i<in.length; i++ ) {
                out[i] = in[i]; 
            }
		
            for(int i=0;i<out.length;i++){
                for(int j=0; j<what.length;j++){
                    if(out[i].equals(what[j])){ //if an element in the array out is equal to an element in the array what
                        out[i] = with[j]; //replace the element in the array out with the element at the same index was what[i] in with
                }
              }
            } 
      	}
        return out;
    }
}
