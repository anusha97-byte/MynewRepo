package accesspackage;

import accessspecifier.Access_Spe_Ex;

public class Access_Ex3 extends Access_Spe_Ex {

	public static void main(String[] args) {
		Access_Ex3 obj=new Access_Ex3();
		obj.promethod();
		obj.pubmethod();
		//obj.defmethod(); it cannot be accessed outside the package
		//obj.primethod(); it cannot be accessed outside the class
	}

}
