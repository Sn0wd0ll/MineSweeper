package minesweeper;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: Arina
 * Date: 03.04.2010
 * Time: 0:20:45
 * To change this template use File | Settings | File Templates.
 */
public class MineSweeperModel
{
    private int width;
	private int height;
	private int bombsCount;
    private MineSweeperCell map[][];

    public MineSweeperModel(int width, int height, int bombsCount)
    {
		init(width, height, bombsCount);
	}
    public MineSweeperModel()
    {
 	}

    public void init(int width, int height, int bombsCount)
    {
       	this.width = width;
		this.height = height;
		this.bombsCount = bombsCount;

		assert width >= 0 && width <= 16;
		assert height >= 0 && height <= 30;
		assert bombsCount >= 0 && bombsCount <= 99;

		//map = new MineSweeperCell[height][width];
	}

    public void fillMap()
    {
        for (int i = 0; i < height; ++i)
        {
			for (int j = 0; j < width; ++j)
            {
				map[i][j] = new MineSweeperCell();
			}
        }
        Random rand = new Random();
        while (bombsCount > 0)
        {
            int i = rand.nextInt(height);
            int j = rand.nextInt(width);
            if (MineSweeperCellState.MINED != map[i][j].getState())
            {
                map[i][j].setState(MineSweeperCellState.MINED);
            }
            for (int x : new int[] { i - 1, i, i + 1 }) 
            {
                for (int y : new int[] { j - 1, j, j + 1 })
                {
                    try
                    {
                        map[x][y].incValue();
					}
                    catch (ArrayIndexOutOfBoundsException e)
                    {}
                }
			}

        }
    }

public void open(int i, int j)
{
    map[i][j].setState(MineSweeperCellState.OPENED);
}
}