package org.dbpedia.extraction.destinations

/**
 * The quads generated by the DBpedia framework are organized in a number of datasets.
 * TODO: use a Scala Enumeration?
 */
class Dataset(val name : String)
{
    override def toString = name
    
    val fileName = name.replace('_', '-')

    override def equals(other : Any) = other match {
      case that : Dataset => (this.name == that.name)
      case _ => false
    }

    override def hashCode = name.hashCode
}
