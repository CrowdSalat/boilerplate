# LiquibaseDemo

[http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## wording

- changeset
- changelog

## change types (in changesets)

- [DDL](https://docs.liquibase.com/change-types/home.html#entities)
  - [createTable](https://docs.liquibase.com/change-types/create-table.html) (CREATE)
  - [addColumn](https://docs.liquibase.com/change-types/add-column.html) (ALTER)
- [DML](https://docs.liquibase.com/change-types/home.html#data)
  - [insert](https://docs.liquibase.com/change-types/insert.html) (INSERT INTO)
  - [update](https://docs.liquibase.com/change-types/update.html) (UPDATE)

## Liquibase file structure for changelogs

From [liquibase best practices page](https://docs.liquibase.com/concepts/bestpractices.html):


The most common way to organize your changelogs is by major release. Make certain to store changelogs in your source control, preferably near the database access code.

```
com
  example
    db
      changelog
        db.changelog-root.xml
        db.changelog-1.0.xml
        db.changelog-1.1.xml
        db.changelog-2.0.xml
```

You can alternatively use an object-oriented design pattern by creating one changelog per object (such as a table, index, etc.) or type of object (such as all tables) and including all the object changelogs within a root changelog.
```
com
  example
    db
      changelog
        db.changelog-root.xml
        db.customer-1.0.xml
        db.product-1.1.xml
        db.shipping-2.0.xml
```

## useful liquibase cli commands

[Overview for liquibase cli](https://docs.liquibase.com/commands/command-list.html)

- diff-changelog command displays the differences between two databases you are comparing
- generate-changelog command creates a changelog file that has a sequence of changesets which describe how to re-create the current state of the database
