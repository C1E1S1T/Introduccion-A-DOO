package models;

public class Player 
{
	public char color;
	
	public Player(char color)
	{
		this.color=color;
	}
	
	
	public void put(Board board)
	{
		System.out.println("juega "+color);
		Coordinate destinationPlace = new Coordinate();
		do
		{
			destinationPlace.select("Coordenada destino de puesta");
		}while(!destinationPlace.isValid() || board.isOccupied(destinationPlace) );
		board.put(destinationPlace, color);
	}
	
	public void move(Board board)
	{
		System.out.println("juega "+color);
		Coordinate originPlace = new Coordinate();
		do
		{
			originPlace.select("Coordenada origen de movimiento");
		}while(!originPlace.isValid() ||  !board.isOccupied(originPlace)  );
		board.emptyCoordinate(originPlace);
		board.show();
		this.put(board);
	}
	
	public void celebrateVictory()
	{
		System.out.println("El jugador con las " + color + " ha ganado");
	}
	
	

}
