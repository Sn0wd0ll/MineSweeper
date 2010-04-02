package minesweeper;

/**
 * Created by IntelliJ IDEA.
 * User: Arina
 * Date: 03.04.2010
 * Time: 1:23:37
 * To change this template use File | Settings | File Templates.
 */
public class MineSweeperLevel
{
	private int width;
	private int height;
	private int mines;
	private String name;

    public MineSweeperLevel(int width, int height, int mines, String name)
    {
		this.width = width;
		this.height = height;
		this.mines = mines;
		this.name = name;
	}

    public MineSweeperLevel()
    {
	}

	public int getWidth()
    {
		return width;
	}

	public int getHeight()
    {
		return height;
	}

	public int getMines()
    {
		return mines;
	}

	public String getName()
    {
		return name;
	}

	public void setWidth(int width)
    {
		this.width = width;
	}

	public void setHeight(int height)
    {
		this.height = height;
	}

	public void setMines(int mines)
    {
		this.mines = mines;
	}

	public void setName(String name)
    {
		this.name = name;
	}
}
