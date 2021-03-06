namespace ContactMVC_With_EF.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class CreateTableContact : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Contacts",
                c => new
                    {
                        Name = c.String(nullable: false, maxLength: 128),
                        Number = c.String(nullable: false),
                    })
                .PrimaryKey(t => t.Name);
            
        }
        
        public override void Down()
        {
            DropTable("dbo.Contacts");
        }
    }
}
