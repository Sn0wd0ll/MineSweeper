package minesweeper;

/**
 * Created by IntelliJ IDEA.
 * User: Arina
 * Date: 03.04.2010
 * Time: 0:23:16
 * To change this template use File | Settings | File Templates.
 */
public class MineSweeperCell
{
    private int value;

    private MineSweeperCellState state;

    public void setState(MineSweeperCellState state)
    {
        this.state = state;
    }

    public MineSweeperCellState getState()
    {
        return state;
    }
    
    public void setValue(int value)
    {
        this.value = value;
    }

    public void incValue()
    {
		this.value++;
	}

}
