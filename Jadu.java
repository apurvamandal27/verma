class Jadu{
	
	String h="hello";
	public static void main(String[]args){
		System.out.println(h);
	}
}
 Intent intent=getIntent();


        Bundle b=intent.getExtras();

        String name=b.getString("name_key");
        String phone=b.getString("phone_key");
        tv.setText(name+"\t"+phone);
		
		
		
		 intent.putExtra("name_key",Name);
                intent.putExtra("phone_key",Phone);

                startActivity(intent);