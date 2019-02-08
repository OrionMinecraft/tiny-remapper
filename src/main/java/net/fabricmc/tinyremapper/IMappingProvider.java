/*
 * Copyright (C) 2016, 2018 Player, asie
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.fabricmc.tinyremapper;

import java.util.Map;

/**
 * Mapping provider interface
 */
@FunctionalInterface
public interface IMappingProvider {
	/**
	 * Loads mappings into {@link TinyRemapper}
	 *
	 * @param classMap Class mappings in 'Foo' to 'bar/Baz' format
	 * @param fieldMap Field mappings in 'Foo/field;;LBar;' to 'bar/Baz/name' format (mapped names do not have descriptors)
	 * @param methodMap Method mappings in 'Foo/a(V)LBar;' to 'bar/Baz/getInfo' format (mapped names do not have descriptors)
	 */
	void load(Map<String, String> classMap, Map<String, String> fieldMap, Map<String, String> methodMap);
}
