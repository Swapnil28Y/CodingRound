package com.prospecta.Service;

import java.util.List;

import com.prospecta.Exceptions.CategoryException;
import com.prospecta.model.Entry;
import com.prospecta.model.FinalDTO;

public interface Services {
	public List<FinalDTO> getTitleAndDescription(String category) throws CategoryException;

	public List<Entry> savingEntry(Entry entry);
}
