class MyGame{
	public static void main(String []args){
		
		Enemy enemy;

		enemy = new Ninja();
		
		enemy.attack();

		enemy.destroy();

		enemy = new Monster();
		
		enemy.attack();

		enemy.destroy();

		Enemy.showInfo();

	}
}