<div class="card my-3">
    <div class="card-body">
        <form action="articoli" class="col-lg-6 col-md-9"  method="post">
        
        <!--
        
            private String descrizione;
            private double prezzo;
            private String categoria;
            private int rimanenza;
        
        
         -->
        <div class="mb-3">
            <label for="descrizione" >descrizione</label>
            <input  class="form-control" type="text" name="descrizione" id="descrizione" placeholder="descrizione">
        </div>
        
        <div class="mb-3">
            <label for="prezzo" >prezzo</label>
            <input  class="form-control" type="decimal(6,2)" name="prezzo" id="prezzo" placeholder="prezzo">
        </div>
        
        <div class="mb-3">
            <label for="categoria" >categoria</label>
            <input  class="form-control" type="text" name="categoria" id="categoria" placeholder="categoria">
        </div>
        
        <div class="mb-3">
            <label for="rimanenza" >rimanenza</label>
            <input  class="form-control" type="number" name="rimanenza" id="rimanenza" placeholder="rimanenza">
        </div>
        
        
        <input type="submit" class="btn btn-primary mt-3" value="Add">
        
        </form>
    </div>
</div>