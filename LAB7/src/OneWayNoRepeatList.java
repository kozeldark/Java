
public class OneWayNoRepeatList {
	public static int DEFAULT_SIZE = 50;

	// entry.length is the total number of items you have room
	// for on the list (its capacity); countOfEntries is the number of
	// items currently on the list.
	private int countOfEntries; // can be less than entry.length.
	private String[] entry;

	public OneWayNoRepeatList(int maximumNumberOfEntries)
	{
		entry = new String[maximumNumberOfEntries];
		countOfEntries = 0;
	}

	public OneWayNoRepeatList()
	{
		entry = new String[DEFAULT_SIZE];
		countOfEntries = 0;
		// or replace these two statements with this(DEFAULT_SIZE);
	}

	public int getMaximumNumberOfEntries() {
		return entry.length;
	}

	public int getNumberOfEntries() {
		return countOfEntries;
	}

	public boolean isFull()
    {
        return countOfEntries == entry.length;
    }

    public boolean isEmpty()
    {
        return countOfEntries == 0;
    }
    
    public boolean isOnList(String item)
    {
        boolean checks = false;
        int i = 0;
        
        while (i < countOfEntries && !checks)
        {
            if (item.equalsIgnoreCase(entry[i]))
                checks = true;
            else	
                i++;
        }
        return checks;
    }
    public boolean isOnList1(String item)
    {
        
        for (int i =0; i < countOfEntries; i++)
        {
            if (item.equalsIgnoreCase(entry[i]))
               return true;
            else	
                i++;
        }
        return false;
    }
    
    public void addItem(String item)
    {
    	if (!isOnList(item))
        {
            if (countOfEntries == entry.length)
            {
                System.out.println("Attempt to add to a full list!");
                System.exit(0);
            }
            else
            {
                entry[countOfEntries] = item;
                countOfEntries++;
            }
        } //else
        
    }
    public String getEntryAt(int position)
    {
    	String result = null;
        if ((1 <= position) && (position <= countOfEntries))
            result = entry[position - 1];
        return result;
    }
    public void eraseList()
    {
        countOfEntries = 0;
    }
    
    public boolean atLastEntry
    (
        int position
    )
    {
        return position == countOfEntries;
    }
}
