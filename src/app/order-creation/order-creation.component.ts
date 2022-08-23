import { Component, OnInit } from '@angular/core';
import { IDropdownSettings } from 'ng-multiselect-dropdown';
import { SeriesDataService } from '../service/data/series-data.service';
import { Series } from '../series';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { Model } from '../model';
import { Accessory } from '../service/data/Accessory';
import { Colors } from '../../colors';

@Component({
  selector: 'app-order-creation',
  templateUrl: './order-creation.component.html',
  styleUrls: ['./order-creation.component.css']
})
export class OrderCreationComponent implements OnInit {
  addForm:FormGroup;
  dropdownList = [];
  selectedItems = [];
  dropdownSettings:IDropdownSettings={};
  colorDropdownSettings:IDropdownSettings={};
  seriesList=[];
  public modelList:Model[]=[]; 
  public accessoryList:Accessory[]=[];
  public colorList:Colors[]=[];
  series:any;
  public modelId:number;
  public accessId:number;
  public modelPrice:number=0;
  public accessPrice:number=0;
  public colorPrice:number=0;
  public totalPrice:number=0;
  public color=[];
  public success:String;

  form=new FormGroup({
    seriesname:new FormControl('',Validators.required),
    model:new FormControl('',Validators.required),
    Accessory: new FormControl('',Validators.required),
    color: new FormControl('',Validators.required)

  });
  constructor(private Seriesservice:SeriesDataService) { }

  ngOnInit(){
          // let resp=this.Seriesservice.getSeriesNames();
          // console.log(resp);
          // resp.subscribe((data)=>this.series=data);
          this.fetchSeriesNames();
          
        this.dropdownSettings = {
          singleSelection: false,
          idField: 'access_id',
          textField: 'access_name',
          selectAllText: 'Select All',
          unSelectAllText: 'UnSelect All',
          enableCheckAll:false,
          itemsShowLimit: 3,
          allowSearchFilter: false
        };

        this.colorDropdownSettings = {
          singleSelection: false,
          idField: 'color_id',
          textField: 'color_name',
          selectAllText: 'Select All',
          unSelectAllText: 'UnSelect All',
          enableCheckAll:false,
          itemsShowLimit: 3,
          allowSearchFilter:false
        };

        
        }
        fetchSeriesNames(){
          this.Seriesservice.getSeriesNames().subscribe(data=>{
            console.log(data)
            this.seriesList=Object.values(data);
          })          
        }
        onOptionsSelected(value:String){
          console.log("the selected value is" +value);
          this.Seriesservice.getModelsForSelectedSeries(value).subscribe((data:Model[])=>{
            console.log(data)
            this.modelList=data;
            
            
          })
        }
        
        onModelSelected(event:any){
          this.populateColors(event)
          this.modelId=event.target.value;
          this.displayModelPrice(this.modelId);
          console.log("the selected value is" +this.modelId);
          this.Seriesservice.getAccessoryForSelectedModels(this.modelId).subscribe((data:Accessory[])=>{
            console.log(data)
            this.accessoryList=data;
          })
          
        }
          
        populateColors(event){
          this.modelId=event.target.value;
          this.Seriesservice.getColorsForSelectedModels(this.modelId).subscribe((data:Colors[])=>{
            console.log(data)
            this.colorList=data;
          })

        }



        onAccessSelect(item:any) {
          console.log(item);
          let access=[];
          Object.keys(item).map(function(key){
            access.push({[key]:item[key]})
          })
          console.log(access[0].access_id);
          this.accessPriceCalculation(access[0].access_id);
            return access;
        }

        onAccessDeSelect(item:any){
          console.log('deselect access',item);
          let accessDeSelect=[];
          Object.keys(item).map(function(key){
            accessDeSelect.push({[key]:item[key]})
          })
          console.log(accessDeSelect[0].access_id);
          this.accessPriceDeCalculation(accessDeSelect[0].access_id);
          return accessDeSelect;
        }

        onColorSelect(item:any){
          console.log(item);
          let colorSelect=[];
          Object.keys(item).map(function(key){
            colorSelect.push({[key]:item[key]})
          })
          console.log(colorSelect[0].color_id);
          this.colorPriceCalculation(colorSelect[0].color_id);
          this.calculateTotalPrice();
          return colorSelect;
        }

        onColorDeSelect(item:any){
          console.log('deSelectcolor',item);
          let colorDeSelect=[];
          Object.keys(item).map(function(key){
             colorDeSelect.push({[key]:item[key]})
          })
              console.log('colordeselect',colorDeSelect[0].color_id);
              this.colorPriceDeCalculation(colorDeSelect[0].color_id);
              return colorDeSelect;
              
        }
        

        accessPriceCalculation(aid:number){
          for(var i=0;i<this.accessoryList.length;i++){
            if(this.accessoryList[i].access_id==aid){
                  this.accessPrice=this.accessPrice+this.accessoryList[i].access_price;
                  console.log(this.accessPrice);
            }
          }
          this.calculateTotalPrice();

        }

        accessPriceDeCalculation(aid:number){
          for(var i=0;i<this.accessoryList.length;i++){
            if(this.accessoryList[i].access_id==aid){
              this.accessPrice=this.accessPrice-this.accessoryList[i].access_price;
            }
          }
          this.calculateTotalPrice();
        }

        colorPriceCalculation(cid:number){
          for(var i=0;i<this.colorList.length;i++){
            if(this.colorList[i].color_id==cid){
              this.colorPrice=this.colorPrice+this.colorList[i].color_price;
              console.log(this.colorPrice);
            }
          }
          this.calculateTotalPrice();

        }

        colorPriceDeCalculation(cid:number){
          for(var i=0;i<this.colorList.length;i++){
            if(this.colorList[i].color_id==cid){
              this.colorPrice=this.colorPrice-this.colorList[i].color_price;

            }
          }
          this.calculateTotalPrice();
        }
         
        displayModelPrice(mid:number){
           for(var i=0;i<this.modelList.length;i++){
             if(this.modelList[i].model_id==mid){
               this.modelPrice=0;
               this.modelPrice=this.modelPrice+this.modelList[i].model_price;
               console.log(this.modelPrice)
             }
           }
           this.calculateTotalPrice();
        }

        calculateTotalPrice(){
          this.totalPrice=this.modelPrice+this.accessPrice+this.colorPrice;
          console.log(this.totalPrice);
        }

        onSubmit(){
          // if(this.form.valid){
          //   console.log("Form submitted!",this.form.value);
          // }
          this.success="Your Order has been Created Successfully";
          console.log(this.success);
        }

      
    }

  


