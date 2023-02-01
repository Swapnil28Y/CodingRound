package com.prospecta.Service;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prospecta.Exceptions.CategoryException;
import com.prospecta.model.Data;
import com.prospecta.model.Entry;
import com.prospecta.model.FinalDTO;

@Service
public class ServiceImp implements Services {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<FinalDTO> getTitleAndDescription(String category) throws CategoryException {
		Data data=restTemplate.getForObject("https://api.publicapis.org/entries", Data.class);
		List<Entry> list = data.getEntries();
		List<FinalDTO> ans= list.stream().filter(s->s.getCategory().equals(category)).map(m->new FinalDTO(m.getApi(),m.getDescription())).toList();
		return ans;
		
	}

	@Override
	public List<Entry> savingEntry(Entry entry) {
		Data data = restTemplate.getForObject("https://api.publicapis.org/entries", Data.class);
		List<Entry> list = data.getEntries();
		list.add(entry);
		return list;
	}

}
