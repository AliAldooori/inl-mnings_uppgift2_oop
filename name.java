package inlamnings_uppgift_2_AliAldoori;

import java.util.Comparator;




	public class name   implements Comparator<Varor>{

		@Override
		public  int compare(Varor o1, Varor o2) {
			return o1.getVarans_namn().compareTo(o2.getVarans_namn());
		}
	
	}
		 class  pris  implements Comparator<Varor>{

			@Override
			public int compare(Varor o1, Varor o2) {
				return (int) ( o1.getNettopris() - o2.getNettopris());
			}
		}
		
		 class moms_sats   implements Comparator<Varor>{
				
				@Override
				public int compare(Varor o1, Varor o2) {
					return (int) ( o1.brutto_pris() - o2.brutto_pris());
				}

			
		 }
			
	


