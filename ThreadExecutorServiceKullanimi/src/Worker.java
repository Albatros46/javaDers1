
public class Worker implements Runnable {

	private String isim;
    private int task_id;
    
	public Worker(String isim, int task_id) {
		this.isim = isim;
		this.task_id = task_id;
	}

	@Override
	public void run() {
		
		System.out.println("Worker "+isim+" "+task_id+" mesaiye basladi.");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Worker "+isim+" "+task_id+" birinci isi bitirdi.");
	}

}
