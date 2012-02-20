/**
 * 
 */
package de.bmw.carit.jnario.lib.internal;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Iterator;
import java.util.List;

/**
 * @author Sebastian Benz
 *
 */
public class RowResults implements Iterable<RowResult>{

	private RowFailed firstFailure = null;
	private List<RowResult> results = newArrayList();

	public boolean hasFailed() {
		return firstFailure != null;
	}

	public void add(RowResult result) {
		if (firstFailure == null && result instanceof RowFailed) {
			firstFailure = (RowFailed) result;
		}
		this.results .add(result);
	}

	public StackTraceElement[] getStackTrace() {
		return firstFailure.getCause().getStackTrace();
	}

	@Override
	public Iterator<RowResult> iterator() {
		return results.iterator();
	}

}
