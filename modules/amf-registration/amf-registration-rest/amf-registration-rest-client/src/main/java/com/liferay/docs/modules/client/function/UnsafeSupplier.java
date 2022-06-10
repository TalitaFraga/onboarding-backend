package com.liferay.docs.modules.client.function;

import javax.annotation.Generated;

/**
 * @author TalitaFraga
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}