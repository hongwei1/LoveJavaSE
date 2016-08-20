package itcastday22.p2.filter;

import java.io.File;
import java.io.FileFilter;

public class FilterByHidden implements FileFilter {

	@Override
	public boolean accept(File pathname) {

		return !pathname.isHidden();
	}

}
